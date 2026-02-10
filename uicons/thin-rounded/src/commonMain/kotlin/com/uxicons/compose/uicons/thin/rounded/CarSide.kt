package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarSide: ImageVector? = null

val Icons.Tr.CarSide: ImageVector
    get() = _CarSide ?: UXIcon(name = "CarSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.92f, 10.23f)
                lineToRelative(-0.01f, -0.02f)
                lineToRelative(-4.38f, -6.29f)
                curveToRelative(-0.84f, -1.21f, -2.22f, -1.93f, -3.69f, -1.93f)
                horizontalLineToRelative(-4.84f)
                curveToRelative(-1.86f, 0f, -3.55f, 1.17f, -4.21f, 2.9f)
                lineTo(1.66f, 10.52f)
                curveToRelative(-1.0f, 0.62f, -1.66f, 1.72f, -1.66f, 2.98f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.99f, -1.29f, -3.67f, -3.08f, -4.27f)
                close()
                moveTo(15.71f, 4.5f)
                lineToRelative(3.83f, 5.5f)
                lineTo(11f, 10.0f)
                lineTo(11f, 3f)
                horizontalLineToRelative(1.84f)
                curveToRelative(1.14f, 0f, 2.22f, 0.56f, 2.87f, 1.5f)
                close()
                moveTo(4.73f, 5.26f)
                curveToRelative(0.51f, -1.35f, 1.83f, -2.26f, 3.27f, -2.26f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                lineTo(3.5f, 10.0f)
                curveToRelative(-0.2f, 0f, -0.4f, 0.02f, -0.59f, 0.05f)
                lineToRelative(1.82f, -4.79f)
                close()
                moveTo(7f, 19.0f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1f)
                lineTo(7f, 18.0f)
                verticalLineToRelative(1f)
                close()
                moveTo(21f, 19.0f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                close()
                moveTo(23f, 16.0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(2f, 17.0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                lineTo(19.5f, 11.0f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _CarSide = it}
