package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UpFromBracket: ImageVector? = null

val Icons.Ts.UpFromBracket: ImageVector
    get() = _UpFromBracket ?: UXIcon(name = "UpFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 20f)
                horizontalLineToRelative(10f)
                lineTo(17f, 11f)
                horizontalLineToRelative(6.67f)
                lineTo(13.84f, 0.76f)
                curveToRelative(-0.49f, -0.49f, -1.14f, -0.76f, -1.84f, -0.76f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.69f, 0f, -1.35f, 0.27f, -1.83f, 0.76f)
                lineTo(0.33f, 11f)
                lineTo(7f, 11f)
                verticalLineToRelative(9f)
                close()
                moveTo(2.67f, 10f)
                lineTo(10.88f, 1.47f)
                curveToRelative(0.3f, -0.3f, 0.7f, -0.47f, 1.12f, -0.47f)
                horizontalLineToRelative(0f)
                curveToRelative(0.43f, 0f, 0.83f, 0.17f, 1.12f, 0.46f)
                lineToRelative(8.2f, 8.54f)
                horizontalLineToRelative(-5.33f)
                verticalLineToRelative(9f)
                lineTo(8f, 19f)
                lineTo(8f, 10f)
                lineTo(2.67f, 10f)
                close()
                moveTo(24f, 15f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(2.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                lineTo(1f, 15f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                lineTo(21.5f, 23f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(1f)
                close()
            }
        }.also { _UpFromBracket = it}
