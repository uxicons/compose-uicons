package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PriorityImportance: ImageVector? = null

val Icons.Ss.PriorityImportance: ImageVector
    get() = _PriorityImportance ?: UXIcon(name = "PriorityImportance") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2f)
                verticalLineToRelative(2f)
                lineTo(8f, 4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(16f)
                close()
                moveTo(13f, 11f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(0f, 0f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6.0f)
                lineTo(0f, 6.0f)
                lineTo(0f, 0f)
                close()
                moveTo(0f, 9f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6.0f)
                lineTo(0f, 15.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(8f, 22f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                close()
                moveTo(0f, 18f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6.0f)
                lineTo(0f, 24.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(17.59f, 6.59f)
                lineToRelative(-3.58f, 3.58f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.58f, -2.58f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-15f)
                lineToRelative(2.56f, 2.56f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.56f, -3.56f)
                curveToRelative(-0.76f, -0.76f, -2.07f, -0.76f, -2.83f, 0f)
                close()
            }
        }.also { _PriorityImportance = it}
