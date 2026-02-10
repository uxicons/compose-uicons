package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParagraphLeft: ImageVector? = null

val Icons.Ts.ParagraphLeft: ImageVector
    get() = _ParagraphLeft ?: UXIcon(name = "ParagraphLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 11f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                lineTo(15f, 1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(1f)
                lineTo(19f, 1f)
                horizontalLineToRelative(2f)
                lineTo(21f, 0f)
                horizontalLineToRelative(-12.5f)
                curveTo(5.47f, 0f, 3f, 2.47f, 3f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                close()
                moveTo(8.5f, 1f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveTo(6.02f, 1f, 8.5f, 1f)
                close()
                moveTo(23f, 20f)
                lineTo(2.29f, 20f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.47f, -3.47f)
                curveToRelative(-0.57f, -0.58f, -0.57f, -1.51f, 0f, -2.09f)
                lineToRelative(3.47f, -3.47f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.3f, 3.3f)
                horizontalLineToRelative(20.71f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _ParagraphLeft = it}
