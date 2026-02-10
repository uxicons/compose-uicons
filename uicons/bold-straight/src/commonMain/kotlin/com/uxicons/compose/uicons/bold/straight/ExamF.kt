package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExamF: ImageVector? = null

val Icons.Bs.ExamF: ImageVector
    get() = _ExamF ?: UXIcon(name = "ExamF") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.38f, 0f)
                horizontalLineToRelative(-10.88f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-18.34f)
                close()
                moveTo(5f, 21f)
                verticalLineToRelative(-17.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(13f)
                close()
                moveTo(7f, 11f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-2.9f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(2.9f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-2.9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.6f)
                close()
                moveTo(13f, 14.4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _ExamF = it}
