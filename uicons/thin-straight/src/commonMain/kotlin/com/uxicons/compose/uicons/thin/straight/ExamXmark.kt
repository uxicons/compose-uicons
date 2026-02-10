package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ExamXmark: ImageVector? = null

val Icons.Ts.ExamXmark: ImageVector
    get() = _ExamXmark ?: UXIcon(name = "ExamXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                horizontalLineToRelative(-15f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-21.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(21f, 23f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-20.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(18.35f, 14.85f)
                lineTo(15.96f, 17.24f)
                lineTo(18.35f, 19.63f)
                lineTo(17.65f, 20.34f)
                lineTo(15.26f, 17.95f)
                lineTo(12.87f, 20.34f)
                lineTo(12.16f, 19.63f)
                lineTo(14.55f, 17.24f)
                lineTo(12.16f, 14.85f)
                lineTo(12.87f, 14.15f)
                lineTo(15.26f, 16.54f)
                lineTo(17.65f, 14.15f)
                close()
                moveTo(18f, 10f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(12f)
                close()
                moveTo(18f, 6f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(12f)
                close()
                moveTo(6f, 13f)
                horizontalLineToRelative(5.38f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(-4.38f)
                close()
            }
        }.also { _ExamXmark = it}
