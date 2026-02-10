package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExamD: ImageVector? = null

val Icons.Ss.ExamD: ImageVector
    get() = _ExamD ?: UXIcon(name = "ExamD") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.41f, 5f)
                horizontalLineToRelative(-4.41f)
                verticalLineToRelative(-4.41f)
                close()
                moveTo(9.5f, 12.6f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(4.8f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.5f, 0f, 0.9f, -0.4f, 0.9f, -0.9f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.5f, -0.4f, -0.9f, -0.9f, -0.9f)
                close()
                moveTo(15f, 7f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-10f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-17f)
                close()
                moveTo(12f, 16.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(18f, 15.8f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(1.2f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(1.2f)
                close()
            }
        }.also { _ExamD = it}
