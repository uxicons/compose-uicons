package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExamF: ImageVector? = null

val Icons.Ss.ExamF: ImageVector
    get() = _ExamF ?: UXIcon(name = "ExamF") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 7f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-10f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-17f)
                close()
                moveTo(10.5f, 12.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(17f, 16f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(4f)
                close()
                moveTo(21.41f, 5f)
                horizontalLineToRelative(-4.41f)
                verticalLineToRelative(-4.41f)
                close()
            }
        }.also { _ExamF = it}
