package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemplateAlt: ImageVector? = null

val Icons.Ts.TemplateAlt: ImageVector
    get() = _TemplateAlt ?: UXIcon(name = "TemplateAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                close()
                moveTo(7f, 17f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(17f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                close()
                moveTo(15f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                close()
                moveTo(6f, 8f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1f)
                lineTo(6f, 7f)
                verticalLineToRelative(1f)
                close()
                moveTo(22f, 7.29f)
                lineTo(22f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 2.5f)
                curveTo(2f, 1.12f, 3.12f, 0f, 4.5f, 0f)
                lineTo(14.71f, 0f)
                lineToRelative(7.29f, 7.29f)
                close()
                moveTo(15f, 7f)
                horizontalLineToRelative(5.29f)
                lineTo(15f, 1.71f)
                lineTo(15f, 7f)
                close()
                moveTo(21f, 23f)
                lineTo(21f, 8f)
                horizontalLineToRelative(-7f)
                lineTo(14f, 1f)
                lineTo(4.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(3f, 23f)
                lineTo(21f, 23f)
                close()
            }
        }.also { _TemplateAlt = it}
