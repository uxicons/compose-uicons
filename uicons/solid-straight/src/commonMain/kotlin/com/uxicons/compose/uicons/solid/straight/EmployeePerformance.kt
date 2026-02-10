package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmployeePerformance: ImageVector? = null

val Icons.Ss.EmployeePerformance: ImageVector
    get() = _EmployeePerformance ?: UXIcon(name = "EmployeePerformance") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 13f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(22.44f, 4.87f)
                curveToRelative(-0.84f, -1.81f, -1.99f, -3.45f, -3.41f, -4.87f)
                lineToRelative(-1.32f, 1.31f)
                curveToRelative(1.22f, 1.27f, 2.22f, 2.75f, 2.95f, 4.39f)
                close()
                moveTo(18.0f, 12.03f)
                curveToRelative(0f, -0.01f, 0.0f, -0.02f, 0.0f, -0.03f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                curveToRelative(0.35f, 0f, 0.68f, -0.1f, 0.96f, -0.26f)
                lineToRelative(6.02f, 3.61f)
                lineToRelative(1.01f, -1.72f)
                lineToRelative(-6.0f, -3.61f)
                close()
                moveTo(21.99f, 12.1f)
                lineTo(23.95f, 13.27f)
                curveToRelative(0.03f, -0.42f, 0.05f, -0.85f, 0.05f, -1.27f)
                curveToRelative(0f, -1.68f, -0.25f, -3.33f, -0.73f, -4.93f)
                lineToRelative(-1.9f, 0.58f)
                curveToRelative(0.34f, 1.17f, 0.66f, 2.94f, 0.62f, 4.45f)
                close()
                moveTo(17.7f, 22.69f)
                lineTo(19.02f, 24f)
                curveToRelative(1.38f, -1.38f, 2.49f, -2.95f, 3.32f, -4.7f)
                lineToRelative(-1.67f, -1.0f)
                curveToRelative(-0.73f, 1.56f, -1.81f, 3.17f, -2.97f, 4.39f)
                close()
                moveTo(5f, 15f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(6f)
                lineToRelative(1.39f, -5.92f)
                lineToRelative(-2.05f, -3.08f)
                horizontalLineToRelative(-0.33f)
                close()
                moveTo(11f, 15f)
                horizontalLineToRelative(-0.33f)
                lineToRelative(-2.05f, 3.08f)
                lineToRelative(1.39f, 5.92f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
            }
        }.also { _EmployeePerformance = it}
