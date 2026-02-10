package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsFromLine: ImageVector? = null

val Icons.Ss.ArrowsFromLine: ImageVector
    get() = _ArrowsFromLine ?: UXIcon(name = "ArrowsFromLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11f)
                verticalLineToRelative(2f)
                lineTo(0f, 13f)
                verticalLineToRelative(-2f)
                lineTo(24f, 11f)
                close()
                moveTo(13f, 21f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(3.5f, 3.5f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f)
                reflectiveCurveToRelative(1.02f, -0.2f, 1.41f, -0.58f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.5f, 2.5f)
                close()
                moveTo(11f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                lineTo(13f, 3f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(1.41f, -1.41f)
                lineTo(13.41f, 0.59f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
                lineToRelative(-3.5f, 3.5f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.5f, -2.5f)
                close()
            }
        }.also { _ArrowsFromLine = it}
