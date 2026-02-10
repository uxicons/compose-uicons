package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _QuranUser: ImageVector? = null

val Icons.Rs.QuranUser: ImageVector
    get() = _QuranUser ?: UXIcon(name = "QuranUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.95f, 3f)
                curveToRelative(0f, -1.66f, 1.37f, -3f, 3.05f, -3f)
                reflectiveCurveToRelative(2.95f, 1.34f, 2.95f, 3f)
                reflectiveCurveToRelative(-1.26f, 3f, -2.95f, 3f)
                reflectiveCurveToRelative(-3.05f, -1.34f, -3.05f, -3f)
                close()
                moveTo(9f, 11f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.15f)
                lineToRelative(2f, -1f)
                verticalLineToRelative(-2.15f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2.15f)
                lineToRelative(2f, 1f)
                close()
                moveTo(17.02f, 17.61f)
                lineTo(21.45f, 15.39f)
                lineTo(20.55f, 13.61f)
                lineTo(12.0f, 17.88f)
                lineTo(3.45f, 13.61f)
                lineTo(2.55f, 15.39f)
                lineTo(6.97f, 17.61f)
                lineTo(2.0f, 22.51f)
                verticalLineToRelative(1.49f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5.64f)
                lineToRelative(3.5f, -3.45f)
                lineToRelative(3.13f, 1.57f)
                lineToRelative(3.13f, -1.57f)
                lineToRelative(3.5f, 3.45f)
                horizontalLineToRelative(-5.64f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-1.5f)
                lineToRelative(-4.97f, -4.9f)
                close()
            }
        }.also { _QuranUser = it}
