package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sandwich: ImageVector? = null

val Icons.Rc.Sandwich: ImageVector
    get() = _Sandwich ?: UXIcon(name = "Sandwich") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.84f, 16.31f)
                lineTo(4.17f, 16.31f)
                curveToRelative(-1.75f, 0f, -3.17f, 1.42f, -3.17f, 3.17f)
                curveToRelative(0f, 1.75f, 1.42f, 3.17f, 3.17f, 3.17f)
                horizontalLineToRelative(15.67f)
                curveToRelative(1.75f, 0f, 3.17f, -1.42f, 3.17f, -3.17f)
                curveToRelative(0f, -1.75f, -1.42f, -3.17f, -3.17f, -3.17f)
                close()
                moveTo(19.84f, 20.65f)
                lineTo(4.17f, 20.65f)
                curveToRelative(-0.64f, 0f, -1.17f, -0.52f, -1.17f, -1.17f)
                curveToRelative(0f, -0.64f, 0.52f, -1.17f, 1.17f, -1.17f)
                horizontalLineToRelative(15.67f)
                curveToRelative(0.64f, 0f, 1.17f, 0.52f, 1.17f, 1.17f)
                curveToRelative(0f, 0.64f, -0.52f, 1.17f, -1.17f, 1.17f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.82f, 12.78f)
                curveToRelative(-0.7f, 0.44f, -1.57f, 0.44f, -2.29f, -0.01f)
                curveToRelative(-1.34f, -0.83f, -3.06f, -0.83f, -4.4f, 0.0f)
                curveToRelative(-0.7f, 0.44f, -1.57f, 0.44f, -2.28f, -0.0f)
                curveToRelative(-1.34f, -0.84f, -3.06f, -0.84f, -4.4f, 0f)
                curveToRelative(-0.7f, 0.44f, -1.58f, 0.44f, -2.28f, 0f)
                curveToRelative(-0.47f, -0.29f, -1.08f, -0.15f, -1.38f, 0.32f)
                curveToRelative(-0.29f, 0.47f, -0.15f, 1.08f, 0.32f, 1.38f)
                curveToRelative(1.34f, 0.84f, 3.07f, 0.84f, 4.4f, 0f)
                curveToRelative(0.7f, -0.44f, 1.58f, -0.44f, 2.28f, 0f)
                curveToRelative(1.34f, 0.84f, 3.06f, 0.84f, 4.41f, -0.0f)
                curveToRelative(0.69f, -0.43f, 1.58f, -0.43f, 2.29f, 0.01f)
                curveToRelative(0.68f, 0.42f, 1.44f, 0.64f, 2.2f, 0.64f)
                reflectiveCurveToRelative(1.52f, -0.21f, 2.2f, -0.64f)
                curveToRelative(0.47f, -0.29f, 0.61f, -0.91f, 0.32f, -1.38f)
                curveToRelative(-0.29f, -0.47f, -0.91f, -0.61f, -1.38f, -0.32f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.09f, 10.94f)
                lineTo(20.96f, 10.94f)
                curveToRelative(0.47f, 0f, 0.87f, -0.32f, 0.98f, -0.78f)
                curveToRelative(0.03f, -0.13f, 0.71f, -3.21f, -0.28f, -5.37f)
                curveToRelative(-1.11f, -2.42f, -4.16f, -3.37f, -4.29f, -3.4f)
                curveToRelative(-0.1f, -0.03f, -0.18f, -0.05f, -0.29f, -0.04f)
                curveTo(7.44f, 1.35f, 1.62f, 7.22f, 1.38f, 7.47f)
                curveToRelative(-0.18f, 0.19f, -0.28f, 0.44f, -0.28f, 0.7f)
                verticalLineToRelative(1.77f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveTo(3.09f, 8.6f)
                curveToRelative(1.22f, -1.1f, 6.28f, -5.2f, 13.82f, -5.25f)
                curveToRelative(0.49f, 0.18f, 2.29f, 0.91f, 2.92f, 2.28f)
                curveToRelative(0.43f, 0.95f, 0.39f, 2.36f, 0.27f, 3.31f)
                lineTo(3.09f, 8.95f)
                verticalLineToRelative(-0.34f)
                close()
            }
        }.also { _Sandwich = it}
