package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandyCane: ImageVector? = null

val Icons.Sc.CandyCane: ImageVector
    get() = _CandyCane ?: UXIcon(name = "CandyCane") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.86f, 1.03f)
                curveToRelative(0.21f, -0.02f, 0.42f, -0.03f, 0.64f, -0.03f)
                curveToRelative(2.0f, 0f, 3.89f, 0.78f, 5.3f, 2.2f)
                curveToRelative(0.25f, 0.25f, 0.48f, 0.53f, 0.69f, 0.81f)
                lineToRelative(-4.97f, 2.54f)
                lineToRelative(-1.66f, -5.52f)
                close()
                moveTo(6.25f, 7.28f)
                curveToRelative(-0.68f, 1.01f, -1.27f, 2.08f, -1.8f, 3.15f)
                lineToRelative(6.54f, 1.04f)
                curveToRelative(0.55f, -0.91f, 1.41f, -1.95f, 2.1f, -2.72f)
                close()
                moveTo(3.58f, 12.33f)
                curveToRelative(-0.44f, 1.05f, -0.81f, 2.07f, -1.13f, 3.02f)
                lineToRelative(6.32f, 0.88f)
                curveToRelative(0.37f, -1.0f, 0.7f, -1.88f, 1.19f, -2.88f)
                lineToRelative(-6.38f, -1.02f)
                close()
                moveTo(17.07f, 8.52f)
                curveToRelative(0.01f, 0.27f, -0.09f, 0.52f, -0.26f, 0.71f)
                curveToRelative(-0.07f, 0.12f, -0.14f, 0.23f, -0.24f, 0.33f)
                curveToRelative(-0.3f, 0.3f, -0.38f, 0.75f, -0.2f, 1.13f)
                curveToRelative(0.68f, 1.46f, 1.73f, 2.51f, 3.29f, 3.3f)
                curveToRelative(0.38f, 0.2f, 0.85f, 0.12f, 1.16f, -0.19f)
                curveToRelative(1.42f, -1.42f, 2.2f, -3.3f, 2.2f, -5.3f)
                curveToRelative(0f, -0.96f, -0.18f, -1.88f, -0.52f, -2.75f)
                lineToRelative(-5.41f, 2.77f)
                close()
                moveTo(14.57f, 7.01f)
                lineTo(12.91f, 1.47f)
                curveToRelative(-1.05f, 0.37f, -2.09f, 0.96f, -3.03f, 1.74f)
                curveToRelative(-0.84f, 0.67f, -1.61f, 1.45f, -2.31f, 2.29f)
                lineToRelative(7.01f, 1.5f)
                close()
                moveTo(1.86f, 17.29f)
                curveToRelative(-0.56f, 1.98f, -0.81f, 3.37f, -0.84f, 3.53f)
                curveToRelative(-0.07f, 0.37f, 0.08f, 0.75f, 0.39f, 0.98f)
                curveToRelative(1.25f, 0.96f, 3.03f, 1.35f, 4.76f, 1.2f)
                curveToRelative(0.42f, -0.03f, 0.77f, -0.32f, 0.88f, -0.73f)
                curveToRelative(0.41f, -1.34f, 0.57f, -2.51f, 1.06f, -4.11f)
                close()
            }
        }.also { _CandyCane = it}
