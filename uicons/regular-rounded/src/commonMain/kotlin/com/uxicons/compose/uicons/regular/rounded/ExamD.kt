package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExamD: ImageVector? = null

val Icons.Rr.ExamD: ImageVector
    get() = _ExamD ?: UXIcon(name = "ExamD") {
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
                moveTo(12f, 13.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(10.4f, 13.5f)
                curveToRelative(0f, -0.5f, -0.4f, -0.9f, -0.9f, -0.9f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(4.8f)
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
        }.also { _ExamD = it}
