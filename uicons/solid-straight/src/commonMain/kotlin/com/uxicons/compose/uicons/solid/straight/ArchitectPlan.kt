package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArchitectPlan: ImageVector? = null

val Icons.Ss.ArchitectPlan: ImageVector
    get() = _ArchitectPlan ?: UXIcon(name = "ArchitectPlan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.0f, 24f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-4.86f)
                curveToRelative(0f, -1.38f, 0.93f, -2.57f, 2.27f, -2.91f)
                lineToRelative(4.62f, -1.16f)
                curveToRelative(1.52f, -0.43f, 3.16f, 0.85f, 3.11f, 2.43f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(11.0f, 19.14f)
                curveToRelative(0f, -1.38f, -0.93f, -2.57f, -2.27f, -2.91f)
                lineToRelative(-4.62f, -1.16f)
                curveToRelative(-1.52f, -0.43f, -3.16f, 0.85f, -3.11f, 2.43f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-4.86f)
                close()
                moveTo(17.98f, 5f)
                curveToRelative(-0.24f, -2.63f, -2.34f, -4.74f, -4.98f, -4.98f)
                verticalLineToRelative(3.98f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.98f)
                curveToRelative(-2.63f, 0.24f, -4.74f, 2.34f, -4.98f, 4.98f)
                horizontalLineToRelative(-1.02f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                close()
                moveTo(6f, 9f)
                horizontalLineToRelative(12f)
                curveToRelative(0.01f, 3.29f, -2.69f, 6.0f, -6f, 6f)
                curveToRelative(-3.31f, 0.0f, -6.0f, -2.71f, -6f, -6f)
                close()
            }
        }.also { _ArchitectPlan = it}
