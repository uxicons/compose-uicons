package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _QuranUser: ImageVector? = null

val Icons.Ss.QuranUser: ImageVector
    get() = _QuranUser ?: UXIcon(name = "QuranUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.95f, 3f)
                curveToRelative(0f, -1.66f, 1.37f, -3f, 3.05f, -3f)
                reflectiveCurveToRelative(2.95f, 1.34f, 2.95f, 3f)
                reflectiveCurveToRelative(-1.26f, 3f, -2.95f, 3f)
                reflectiveCurveToRelative(-3.05f, -1.34f, -3.05f, -3f)
                close()
                moveTo(17.08f, 17.58f)
                lineTo(21.45f, 15.39f)
                lineTo(20.55f, 13.61f)
                lineTo(12.0f, 17.88f)
                lineTo(3.45f, 13.61f)
                lineTo(2.55f, 15.39f)
                lineTo(6.9f, 17.57f)
                lineTo(2.0f, 22.27f)
                verticalLineToRelative(1.73f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(6.7f)
                lineToRelative(2.05f, 2f)
                horizontalLineToRelative(-6.75f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1.62f)
                close()
                moveTo(17f, 13.14f)
                verticalLineToRelative(-2.15f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2.15f)
                lineToRelative(5f, 2.48f)
                close()
            }
        }.also { _QuranUser = it}
