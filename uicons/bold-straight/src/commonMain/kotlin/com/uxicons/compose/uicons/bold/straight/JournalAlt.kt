package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _JournalAlt: ImageVector? = null

val Icons.Bs.JournalAlt: ImageVector
    get() = _JournalAlt ?: UXIcon(name = "JournalAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 10f)
                lineTo(5f, 10f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                close()
                moveTo(10f, 12f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(22f, 0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(20f)
                lineToRelative(2f, 2f)
                lineToRelative(2f, -2f)
                lineTo(24f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(16f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(18.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(3.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0f, 2f)
                horizontalLineToRelative(2f)
                lineTo(2f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.5f)
                lineTo(7.5f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.5f)
                lineTo(13f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
                moveTo(15f, 5f)
                lineTo(3f, 5f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, -0.23f, 0.5f, -0.5f)
                lineTo(15f, 5f)
                close()
            }
        }.also { _JournalAlt = it}
