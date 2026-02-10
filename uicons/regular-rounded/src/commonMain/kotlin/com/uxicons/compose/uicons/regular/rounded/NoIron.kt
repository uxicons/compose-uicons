package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoIron: ImageVector? = null

val Icons.Rr.NoIron: ImageVector
    get() = _NoIron ?: UXIcon(name = "NoIron") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(3.96f, 22f)
                curveToRelative(-1.49f, 0f, -2.58f, -0.41f, -3.26f, -1.21f)
                curveTo(-0.23f, 19.7f, 0.01f, 18.33f, 0.08f, 17.88f)
                curveToRelative(0.52f, -3.27f, 2.56f, -6.11f, 5.45f, -7.65f)
                curveToRelative(0.49f, -0.26f, 1.09f, -0.07f, 1.35f, 0.41f)
                reflectiveCurveToRelative(0.07f, 1.09f, -0.41f, 1.35f)
                curveToRelative(-2.34f, 1.25f, -3.99f, 3.55f, -4.41f, 6.16f)
                curveToRelative(-0.05f, 0.31f, -0.16f, 0.97f, 0.16f, 1.35f)
                curveToRelative(0.28f, 0.33f, 0.87f, 0.5f, 1.73f, 0.5f)
                horizontalLineToRelative(12.04f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(22.22f, 20.81f)
                lineToRelative(1.48f, 1.48f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineTo(0.29f, 1.71f)
                curveTo(-0.1f, 1.32f, -0.1f, 0.68f, 0.29f, 0.29f)
                reflectiveCurveTo(1.32f, -0.1f, 1.71f, 0.29f)
                lineTo(10.41f, 9f)
                horizontalLineToRelative(11.5f)
                curveToRelative(-0.48f, -2.83f, -2.94f, -5f, -5.91f, -5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(7f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.49f, -0.67f, 2.87f, -1.78f, 3.81f)
                close()
                moveTo(20.79f, 19.38f)
                curveToRelative(0.74f, -0.56f, 1.21f, -1.43f, 1.21f, -2.38f)
                verticalLineToRelative(-6f)
                lineTo(12.41f, 11f)
                lineToRelative(8.38f, 8.38f)
                close()
            }
        }.also { _NoIron = it}
