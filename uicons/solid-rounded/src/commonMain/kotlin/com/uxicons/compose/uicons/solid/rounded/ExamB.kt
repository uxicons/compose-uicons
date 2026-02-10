package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExamB: ImageVector? = null

val Icons.Sr.ExamB: ImageVector
    get() = _ExamB ?: UXIcon(name = "ExamB") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.41f, 5f)
                horizontalLineToRelative(-4.41f)
                verticalLineToRelative(-4.41f)
                close()
                moveTo(9.31f, 13.98f)
                horizontalLineToRelative(-0.71f)
                verticalLineToRelative(-1.38f)
                horizontalLineToRelative(0.71f)
                curveToRelative(0.38f, 0f, 0.69f, 0.31f, 0.69f, 0.69f)
                reflectiveCurveToRelative(-0.31f, 0.69f, -0.69f, 0.69f)
                close()
                moveTo(22f, 7f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(7f)
                close()
                moveTo(12f, 16.5f)
                curveToRelative(0f, -0.74f, -0.33f, -1.4f, -0.85f, -1.86f)
                curveToRelative(0.28f, -0.38f, 0.45f, -0.84f, 0.45f, -1.35f)
                curveToRelative(0f, -1.27f, -1.03f, -2.29f, -2.29f, -2.29f)
                horizontalLineToRelative(-2.31f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                close()
                moveTo(18f, 14.2f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(1.2f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(1.2f)
                close()
                moveTo(9.5f, 15.6f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.5f, 0f, 0.9f, -0.4f, 0.9f, -0.9f)
                reflectiveCurveToRelative(-0.4f, -0.9f, -0.9f, -0.9f)
                close()
            }
        }.also { _ExamB = it}
