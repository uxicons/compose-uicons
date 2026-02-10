package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _JournalAlt: ImageVector? = null

val Icons.Ts.JournalAlt: ImageVector
    get() = _JournalAlt ?: UXIcon(name = "JournalAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                lineTo(11f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                lineTo(3f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                lineTo(0f, 2f)
                verticalLineToRelative(19.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(12f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(17f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(15f, 0f)
                close()
                moveTo(16f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(2.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(1f, 3f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(18.5f)
                close()
                moveTo(13f, 7f)
                lineTo(4f, 7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(1f)
                close()
                moveTo(13f, 11f)
                lineTo(4f, 11f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(1f)
                close()
                moveTo(10f, 15f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1f)
                close()
                moveTo(21.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(19.02f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(2.5f, -2.5f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 21.1f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-1.5f, -1.5f)
                lineTo(20f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(18.6f)
                close()
            }
        }.also { _JournalAlt = it}
