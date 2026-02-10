package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LegalCase: ImageVector? = null

val Icons.Ss.LegalCase: ImageVector
    get() = _LegalCase ?: UXIcon(name = "LegalCase") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.41f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(15f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(7.8f, 17.91f)
                lineToRelative(6.09f, 6.09f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.34f, 1.34f, 0f, 3f, 0f)
                lineTo(13f, 0f)
                lineTo(13f, 7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3.06f)
                lineToRelative(-2.18f, -2.18f)
                lineToRelative(-3.11f, 3.11f)
                lineTo(4f, 11f)
                verticalLineToRelative(2f)
                lineTo(12.71f, 13f)
                lineToRelative(-2f, 2f)
                lineTo(4f, 15f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.71f)
                lineToRelative(-0.91f, 0.91f)
                close()
                moveTo(4f, 9f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                lineTo(4f, 7f)
                verticalLineToRelative(2f)
                close()
                moveTo(19.75f, 18.34f)
                lineToRelative(1.43f, -1.43f)
                lineToRelative(0.54f, 0.54f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-5.31f, -5.31f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(0.54f, 0.54f)
                lineToRelative(-4.37f, 4.37f)
                lineToRelative(-0.54f, -0.54f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(5.31f, 5.31f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-0.54f, -0.54f)
                lineToRelative(1.52f, -1.52f)
                lineToRelative(4.22f, 4.23f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-4.22f, -4.23f)
                close()
            }
        }.also { _LegalCase = it}
