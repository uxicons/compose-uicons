package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TemplateAlt: ImageVector? = null

val Icons.Ss.TemplateAlt: ImageVector
    get() = _TemplateAlt ?: UXIcon(name = "TemplateAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.77f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(17.36f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(15.36f, 7f)
                lineTo(15.36f, 0f)
                lineTo(5.36f, 0f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                lineTo(2.36f, 24f)
                lineTo(22.36f, 24f)
                lineTo(22.36f, 7f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(10.36f, 20f)
                lineTo(6.36f, 20f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(10.36f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(11.36f, 7f)
                lineTo(6.36f, 7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                close()
                moveTo(18.36f, 20f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveTo(18.36f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _TemplateAlt = it}
