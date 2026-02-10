package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExamF: ImageVector? = null

val Icons.Rs.ExamF: ImageVector
    get() = _ExamF ?: UXIcon(name = "ExamF") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 11f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.6f)
                close()
                moveTo(13f, 16f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(22f, 7.59f)
                verticalLineToRelative(16.41f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(9.41f)
                close()
                moveTo(15f, 7f)
                horizontalLineToRelative(3.59f)
                lineToRelative(-3.59f, -3.59f)
                close()
                moveTo(20f, 9f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(16f)
                close()
            }
        }.also { _ExamF = it}
