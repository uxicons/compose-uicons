package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmployeeHandbook: ImageVector? = null

val Icons.Ss.EmployeeHandbook: ImageVector
    get() = _EmployeeHandbook ?: UXIcon(name = "EmployeeHandbook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.92f, 1.7f)
                curveToRelative(-0.7f, -0.58f, -1.62f, -0.81f, -2.52f, -0.64f)
                lineToRelative(-4.12f, 1f)
                curveToRelative(-1.9f, 0.35f, -3.28f, 2.0f, -3.28f, 3.94f)
                verticalLineToRelative(14.8f)
                lineToRelative(-1f, 0.18f)
                lineToRelative(-1f, -0.18f)
                lineTo(11f, 6f)
                curveToRelative(0.01f, -1.91f, -1.35f, -3.56f, -3.23f, -3.92f)
                lineTo(3.54f, 1.05f)
                curveTo(1.91f, 0.75f, 0.34f, 1.83f, 0.05f, 3.46f)
                curveToRelative(-0.03f, 0.18f, -0.05f, 0.36f, -0.05f, 0.54f)
                verticalLineToRelative(16.83f)
                lineToRelative(12f, 2.18f)
                lineToRelative(12f, -2.18f)
                lineTo(24f, 4f)
                curveToRelative(0f, -0.89f, -0.4f, -1.73f, -1.08f, -2.3f)
                close()
                moveTo(6.5f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(6.5f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _EmployeeHandbook = it}
