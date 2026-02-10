package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PriorityImportance: ImageVector? = null

val Icons.Bs.PriorityImportance: ImageVector
    get() = _PriorityImportance ?: UXIcon(name = "PriorityImportance") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4f)
                lineTo(7f, 4f)
                lineTo(7f, 1f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(3f)
                close()
                moveTo(11f, 10f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                close()
                moveTo(0f, 5f)
                horizontalLineToRelative(5f)
                lineTo(5f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(5f)
                close()
                moveTo(0f, 14f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                lineTo(0f, 9f)
                verticalLineToRelative(5f)
                close()
                moveTo(7f, 22.0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(3f)
                close()
                moveTo(0.01f, 23f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5f)
                lineTo(0.01f, 18f)
                verticalLineToRelative(5f)
                close()
                moveTo(24.04f, 10.46f)
                lineToRelative(-3.73f, -3.73f)
                curveToRelative(-0.97f, -0.97f, -2.56f, -0.97f, -3.53f, 0f)
                lineToRelative(-3.77f, 3.77f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(1.92f, -1.92f)
                verticalLineToRelative(13.29f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-13.29f)
                lineToRelative(1.88f, 1.88f)
                lineToRelative(2.12f, -2.12f)
                close()
            }
        }.also { _PriorityImportance = it}
