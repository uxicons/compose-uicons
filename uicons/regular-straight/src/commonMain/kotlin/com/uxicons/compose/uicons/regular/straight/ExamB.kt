package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExamB: ImageVector? = null

val Icons.Rs.ExamB: ImageVector
    get() = _ExamB ?: UXIcon(name = "ExamB") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 14.2f)
                horizontalLineToRelative(1.2f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(1.2f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(-1.2f)
                close()
                moveTo(11.15f, 14.64f)
                curveToRelative(0.52f, 0.46f, 0.85f, 1.12f, 0.85f, 1.86f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2.31f)
                curveToRelative(1.27f, 0f, 2.29f, 1.03f, 2.29f, 2.29f)
                curveToRelative(0f, 0.51f, -0.17f, 0.97f, -0.45f, 1.35f)
                close()
                moveTo(8.6f, 13.98f)
                horizontalLineToRelative(0.71f)
                curveToRelative(0.38f, 0f, 0.69f, -0.31f, 0.69f, -0.69f)
                reflectiveCurveToRelative(-0.31f, -0.69f, -0.69f, -0.69f)
                horizontalLineToRelative(-0.71f)
                verticalLineToRelative(1.38f)
                close()
                moveTo(10.4f, 16.5f)
                curveToRelative(0f, -0.5f, -0.4f, -0.9f, -0.9f, -0.9f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.5f, 0f, 0.9f, -0.4f, 0.9f, -0.9f)
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
        }.also { _ExamB = it}
