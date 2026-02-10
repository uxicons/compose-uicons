package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmployeeHandbook: ImageVector? = null

val Icons.Bs.EmployeeHandbook: ImageVector
    get() = _EmployeeHandbook ?: UXIcon(name = "EmployeeHandbook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(24f, 4.35f)
                verticalLineToRelative(16.52f)
                lineToRelative(-12f, 2.18f)
                lineTo(0f, 20.88f)
                lineTo(0f, 4.35f)
                curveToRelative(0f, -1.01f, 0.45f, -1.97f, 1.23f, -2.62f)
                curveToRelative(0.78f, -0.65f, 1.8f, -0.92f, 2.79f, -0.74f)
                lineToRelative(5.9f, 1.07f)
                curveToRelative(0.8f, 0.14f, 1.51f, 0.5f, 2.08f, 1f)
                curveToRelative(0.58f, -0.5f, 1.29f, -0.85f, 2.08f, -1f)
                lineToRelative(5.9f, -1.07f)
                curveToRelative(1.0f, -0.18f, 2.02f, 0.09f, 2.79f, 0.74f)
                curveToRelative(0.78f, 0.65f, 1.23f, 1.6f, 1.23f, 2.62f)
                close()
                moveTo(10.5f, 6.36f)
                curveToRelative(0f, -0.66f, -0.47f, -1.22f, -1.12f, -1.34f)
                lineToRelative(-5.9f, -1.07f)
                curveToRelative(-0.17f, -0.03f, -0.28f, 0.04f, -0.34f, 0.09f)
                curveToRelative(-0.07f, 0.06f, -0.15f, 0.16f, -0.15f, 0.31f)
                verticalLineToRelative(14.02f)
                lineToRelative(7.5f, 1.36f)
                lineTo(10.5f, 6.36f)
                close()
                moveTo(21f, 4.35f)
                curveToRelative(0f, -0.16f, -0.08f, -0.26f, -0.15f, -0.31f)
                curveToRelative(-0.06f, -0.05f, -0.17f, -0.12f, -0.34f, -0.09f)
                lineToRelative(-5.9f, 1.07f)
                curveToRelative(-0.65f, 0.12f, -1.12f, 0.68f, -1.12f, 1.34f)
                verticalLineToRelative(13.37f)
                lineToRelative(7.5f, -1.36f)
                lineTo(21f, 4.35f)
                close()
                moveTo(5f, 13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _EmployeeHandbook = it}
