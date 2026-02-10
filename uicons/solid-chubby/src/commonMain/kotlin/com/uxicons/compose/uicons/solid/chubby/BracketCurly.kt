package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketCurly: ImageVector? = null

val Icons.Sc.BracketCurly: ImageVector
    get() = _BracketCurly ?: UXIcon(name = "BracketCurly") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 23f)
                curveToRelative(-1.78f, -0.19f, -3.63f, -0.66f, -3.54f, -0.64f)
                curveToRelative(-0.55f, -0.15f, -0.97f, -0.59f, -1.09f, -1.15f)
                curveToRelative(-0.03f, -0.13f, -0.61f, -3.05f, -0.86f, -6.37f)
                curveToRelative(-0.7f, -0.6f, -1.3f, -1.28f, -1.78f, -2.03f)
                curveToRelative(-0.32f, -0.49f, -0.32f, -1.12f, 0f, -1.62f)
                curveToRelative(0.48f, -0.75f, 1.08f, -1.43f, 1.78f, -2.03f)
                curveToRelative(0.26f, -3.32f, 0.84f, -6.22f, 0.86f, -6.36f)
                curveToRelative(0.11f, -0.55f, 0.52f, -0.99f, 1.06f, -1.15f)
                curveToRelative(0.06f, -0.02f, 1.36f, -0.38f, 3.37f, -0.65f)
                curveToRelative(0.82f, -0.11f, 1.57f, 0.47f, 1.68f, 1.29f)
                reflectiveCurveToRelative(-0.47f, 1.57f, -1.29f, 1.68f)
                curveToRelative(-0.84f, 0.11f, -1.54f, 0.24f, -2.04f, 0.35f)
                curveToRelative(-0.21f, 1.2f, -0.55f, 3.4f, -0.69f, 5.68f)
                curveToRelative(-0.03f, 0.44f, -0.25f, 0.85f, -0.6f, 1.11f)
                curveToRelative(-0.36f, 0.27f, -0.69f, 0.56f, -0.97f, 0.87f)
                curveToRelative(0.29f, 0.31f, 0.61f, 0.61f, 0.97f, 0.87f)
                curveToRelative(0.36f, 0.26f, 0.58f, 0.67f, 0.6f, 1.11f)
                curveToRelative(0.14f, 2.27f, 0.48f, 4.47f, 0.68f, 5.68f)
                curveToRelative(0.51f, 0.1f, 1.21f, 0.23f, 2.06f, 0.35f)
                curveToRelative(0.82f, 0.11f, 1.39f, 0.87f, 1.28f, 1.69f)
                curveToRelative(-0.1f, 0.75f, -0.75f, 1.29f, -1.48f, 1.29f)
                close()
            }
        }.also { _BracketCurly = it}
