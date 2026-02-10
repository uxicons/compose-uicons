package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Assessment: ImageVector? = null

val Icons.Rs.Assessment: ImageVector
    get() = _Assessment ?: UXIcon(name = "Assessment") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(8f, 10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(2f, 22f)
                lineTo(2f, 3.0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1.0f)
                verticalLineToRelative(3f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                verticalLineToRelative(2.21f)
                curveToRelative(0.71f, 0.2f, 1.38f, 0.5f, 2f, 0.86f)
                verticalLineToRelative(-2.07f)
                horizontalLineToRelative(0f)
                lineTo(20f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.34f, 0f, 0f, 1.35f, 0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-0.0f)
                lineToRelative(7.92f, 0.0f)
                curveToRelative(-1.99f, -0.02f, -3.8f, -0.78f, -5.2f, -2.0f)
                lineTo(2f, 22f)
                close()
                moveTo(23.55f, 22.14f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.67f, -2.67f)
                curveToRelative(-0.98f, 0.7f, -2.18f, 1.11f, -3.47f, 1.11f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 1.3f, -0.41f, 2.49f, -1.11f, 3.47f)
                lineToRelative(2.67f, 2.67f)
                close()
                moveTo(20.36f, 14.74f)
                lineToRelative(-1.4f, -1.43f)
                lineToRelative(-3.61f, 3.7f)
                lineToRelative(-2.22f, -2.3f)
                lineToRelative(-1.39f, 1.44f)
                lineToRelative(2.18f, 2.27f)
                curveToRelative(0.77f, 0.77f, 2.08f, 0.76f, 2.82f, 0.02f)
                lineToRelative(0.0f, -0.0f)
                lineToRelative(3.61f, -3.7f)
                close()
                moveTo(5f, 17f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                close()
                moveTo(8f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _Assessment = it}
