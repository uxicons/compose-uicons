package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExamD: ImageVector? = null

val Icons.Bs.ExamD: ImageVector
    get() = _ExamD ?: UXIcon(name = "ExamD") {
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
                moveTo(15.8f, 14.2f)
                horizontalLineToRelative(1.2f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(1.2f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(1.6f)
                close()
                moveTo(9.5f, 11f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(10.4f, 16.5f)
                curveToRelative(0f, 0.5f, -0.4f, 0.9f, -0.9f, 0.9f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(-4.8f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.5f, 0f, 0.9f, 0.4f, 0.9f, 0.9f)
                close()
            }
        }.also { _ExamD = it}
