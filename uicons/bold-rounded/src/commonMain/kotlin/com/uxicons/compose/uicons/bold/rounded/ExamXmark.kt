package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExamXmark: ImageVector? = null

val Icons.Br.ExamXmark: ImageVector
    get() = _ExamXmark ?: UXIcon(name = "ExamXmark") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            horizontalLineToRelative(-13f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(20.5f)
            horizontalLineToRelative(20f)
            verticalLineToRelative(-20.5f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            close()
            moveTo(19f, 21f)
            horizontalLineToRelative(-14f)
            verticalLineToRelative(-17.5f)
            curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(13f)
            curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
            close()
            moveTo(17.47f, 14.66f)
            lineTo(16.14f, 16.0f)
            lineTo(17.47f, 17.34f)
            lineTo(15.35f, 19.46f)
            lineTo(14.01f, 18.12f)
            lineTo(12.68f, 19.46f)
            lineTo(10.55f, 17.34f)
            lineTo(11.89f, 16.0f)
            lineTo(10.55f, 14.66f)
            lineTo(12.68f, 12.54f)
            lineTo(14.01f, 13.88f)
            lineTo(15.35f, 12.54f)
            close()
            moveTo(17f, 8f)
            horizontalLineToRelative(-10f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(10f)
            close()
            moveTo(12.38f, 10f)
            lineTo(9.38f, 13f)
            horizontalLineToRelative(-2.38f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(5.38f)
            close()
        }
    }.also { _ExamXmark = it }
