package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParagraphLeft: ImageVector? = null

val Icons.Rs.ParagraphLeft: ImageVector
    get() = _ParagraphLeft ?: UXIcon(name = "ParagraphLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                lineTo(15f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(2f)
                lineTo(19f, 2f)
                horizontalLineToRelative(2f)
                lineTo(21f, 0f)
                horizontalLineToRelative(-12f)
                curveTo(5.69f, 0f, 3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9f, 2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(23f, 20f)
                lineTo(4f, 20f)
                lineToRelative(2.55f, 2.55f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.55f, -3.55f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                lineToRelative(3.55f, -3.55f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.55f, 2.55f)
                horizontalLineToRelative(19f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _ParagraphLeft = it}
