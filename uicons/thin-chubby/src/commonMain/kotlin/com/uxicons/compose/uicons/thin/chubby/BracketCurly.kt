package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketCurly: ImageVector? = null

val Icons.Tc.BracketCurly: ImageVector
    get() = _BracketCurly ?: UXIcon(name = "BracketCurly") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.5f, 23f)
                curveToRelative(-2.75f, -0.28f, -4.08f, -0.83f, -4.06f, -0.83f)
                curveToRelative(-0.15f, -0.07f, -0.25f, -0.2f, -0.28f, -0.35f)
                curveToRelative(-0.01f, -0.04f, -0.72f, -3.46f, -0.97f, -7.25f)
                curveToRelative(-0.85f, -0.66f, -1.56f, -1.43f, -2.11f, -2.29f)
                curveToRelative(-0.1f, -0.17f, -0.1f, -0.38f, 0f, -0.54f)
                curveToRelative(0.55f, -0.86f, 1.26f, -1.63f, 2.11f, -2.29f)
                curveToRelative(0.25f, -3.8f, 0.96f, -7.22f, 0.97f, -7.25f)
                curveToRelative(0.03f, -0.16f, 0.14f, -0.29f, 0.28f, -0.35f)
                curveToRelative(0.05f, -0.02f, 1.15f, -0.51f, 4f, -0.83f)
                curveToRelative(0.25f, -0.03f, 0.52f, 0.17f, 0.55f, 0.44f)
                curveToRelative(0.03f, 0.27f, -0.17f, 0.52f, -0.44f, 0.55f)
                curveToRelative(-1.96f, 0.22f, -3.03f, 0.52f, -3.47f, 0.67f)
                curveToRelative(-0.17f, 0.89f, -0.71f, 3.87f, -0.91f, 7.07f)
                curveToRelative(-0.01f, 0.15f, -0.08f, 0.28f, -0.2f, 0.37f)
                curveToRelative(-0.75f, 0.55f, -1.37f, 1.19f, -1.87f, 1.9f)
                curveToRelative(0.5f, 0.71f, 1.12f, 1.34f, 1.87f, 1.9f)
                curveToRelative(0.12f, 0.09f, 0.19f, 0.22f, 0.2f, 0.37f)
                curveToRelative(0.2f, 3.2f, 0.74f, 6.18f, 0.91f, 7.07f)
                curveToRelative(0.43f, 0.14f, 1.51f, 0.44f, 3.47f, 0.67f)
                curveToRelative(0.27f, 0.03f, 0.47f, 0.28f, 0.44f, 0.55f)
                curveToRelative(-0.03f, 0.26f, -0.24f, 0.44f, -0.5f, 0.44f)
                close()
            }
        }.also { _BracketCurly = it}
