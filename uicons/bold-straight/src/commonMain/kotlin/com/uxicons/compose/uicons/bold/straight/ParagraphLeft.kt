package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParagraphLeft: ImageVector? = null

val Icons.Bs.ParagraphLeft: ImageVector
    get() = _ParagraphLeft ?: UXIcon(name = "ParagraphLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                lineTo(15f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(3f)
                lineTo(20f, 3f)
                horizontalLineToRelative(2f)
                lineTo(22f, 0f)
                horizontalLineToRelative(-13f)
                curveTo(5.69f, 0f, 3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9f, 3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveTo(23f, 21f)
                lineTo(5f, 21f)
                verticalLineToRelative(3f)
                lineToRelative(-3.71f, -3.79f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(3.71f, -3.79f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _ParagraphLeft = it}
