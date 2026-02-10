package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExamF: ImageVector? = null

val Icons.Ts.ExamF: ImageVector
    get() = _ExamF ?: UXIcon(name = "ExamF") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.71f, 0f)
                horizontalLineToRelative(-10.21f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-16.71f)
                close()
                moveTo(15f, 1.71f)
                lineTo(20.29f, 7f)
                horizontalLineToRelative(-5.29f)
                close()
                moveTo(3f, 23f)
                verticalLineToRelative(-20.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                close()
                moveTo(18f, 16f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                close()
                moveTo(6f, 12f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _ExamF = it}
