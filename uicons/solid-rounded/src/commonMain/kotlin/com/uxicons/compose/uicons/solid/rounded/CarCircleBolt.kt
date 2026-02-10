package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarCircleBolt: ImageVector? = null

val Icons.Sr.CarCircleBolt: ImageVector
    get() = _CarCircleBolt ?: UXIcon(name = "CarCircleBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 10f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(19.77f, 18.43f)
                lineToRelative(-1.32f, 2.64f)
                curveToRelative(-0.25f, 0.49f, -0.85f, 0.69f, -1.34f, 0.45f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.49f, -0.25f, -0.69f, -0.85f, -0.45f, -1.34f)
                lineToRelative(1.08f, -2.17f)
                horizontalLineToRelative(-2.13f)
                curveToRelative(-0.51f, 0f, -0.99f, -0.24f, -1.3f, -0.65f)
                curveToRelative(-0.3f, -0.41f, -0.4f, -0.94f, -0.25f, -1.43f)
                lineToRelative(1.75f, -3.28f)
                curveToRelative(0.26f, -0.49f, 0.87f, -0.67f, 1.35f, -0.41f)
                horizontalLineToRelative(0f)
                curveToRelative(0.48f, 0.26f, 0.67f, 0.87f, 0.4f, 1.35f)
                lineToRelative(-1.3f, 2.42f)
                horizontalLineToRelative(2.12f)
                curveToRelative(0.59f, 0f, 1.13f, 0.32f, 1.41f, 0.84f)
                curveToRelative(0.27f, 0.5f, 0.25f, 1.1f, -0.04f, 1.58f)
                close()
                moveTo(9.52f, 12f)
                lineTo(0.34f, 12f)
                curveToRelative(0.02f, -0.08f, 0.04f, -0.16f, 0.07f, -0.24f)
                lineTo(3.1f, 4.33f)
                curveToRelative(0.71f, -1.97f, 2.6f, -3.29f, 4.7f, -3.29f)
                horizontalLineToRelative(8.4f)
                curveToRelative(2.1f, 0f, 3.98f, 1.32f, 4.7f, 3.29f)
                lineToRelative(2.21f, 6.07f)
                curveToRelative(-1.6f, -1.49f, -3.75f, -2.4f, -6.1f, -2.4f)
                curveToRelative(-3.12f, 0f, -5.87f, 1.59f, -7.48f, 4f)
                close()
                moveTo(8.95f, 21f)
                horizontalLineToRelative(-1.95f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1.42f)
                curveToRelative(-1.76f, -0.77f, -3f, -2.53f, -3f, -4.58f)
                verticalLineToRelative(-1.96f)
                lineTo(4f, 14.04f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.04f)
                horizontalLineToRelative(2.52f)
                curveToRelative(-0.33f, 0.94f, -0.52f, 1.95f, -0.52f, 3f)
                curveToRelative(0f, 1.44f, 0.35f, 2.79f, 0.95f, 4f)
                close()
            }
        }.also { _CarCircleBolt = it}
