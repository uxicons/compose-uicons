package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExamXmark: ImageVector? = null

val Icons.Rs.ExamXmark: ImageVector
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
                moveTo(20f, 22f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(-19f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(18.12f, 15.31f)
                lineTo(16.43f, 17.0f)
                lineTo(18.12f, 18.69f)
                lineTo(16.71f, 20.11f)
                lineTo(15.01f, 18.41f)
                lineTo(13.32f, 20.11f)
                lineTo(11.91f, 18.69f)
                lineTo(13.6f, 17.0f)
                lineTo(11.91f, 15.31f)
                lineTo(13.32f, 13.89f)
                lineTo(15.01f, 15.59f)
                lineTo(16.71f, 13.89f)
                close()
                moveTo(17f, 11f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                close()
                moveTo(17f, 7f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                close()
                moveTo(7f, 13f)
                horizontalLineToRelative(4.38f)
                lineToRelative(-2f, 2f)
                horizontalLineToRelative(-2.38f)
                close()
            }
        }.also { _ExamXmark = it}
