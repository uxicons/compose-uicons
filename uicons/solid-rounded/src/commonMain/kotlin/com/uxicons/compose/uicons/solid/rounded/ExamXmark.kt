package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExamXmark: ImageVector? = null

val Icons.Sr.ExamXmark: ImageVector
    get() = _ExamXmark ?: UXIcon(name = "ExamXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                horizontalLineToRelative(-14f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(7f, 5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(7f, 9f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(9.38f, 15f)
                horizontalLineToRelative(-2.38f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4.38f)
                close()
                moveTo(18.12f, 18.69f)
                lineTo(16.71f, 20.11f)
                lineTo(15.01f, 18.41f)
                lineTo(13.32f, 20.11f)
                lineTo(11.91f, 18.69f)
                lineTo(13.6f, 17.0f)
                lineTo(11.91f, 15.3f)
                lineTo(13.32f, 13.89f)
                lineTo(15.01f, 15.58f)
                lineTo(16.71f, 13.89f)
                lineTo(18.12f, 15.3f)
                lineTo(16.43f, 17.0f)
                close()
            }
        }.also { _ExamXmark = it}
