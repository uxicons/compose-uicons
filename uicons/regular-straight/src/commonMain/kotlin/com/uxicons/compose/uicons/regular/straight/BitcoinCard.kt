package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BitcoinCard: ImageVector? = null

val Icons.Rs.BitcoinCard: ImageVector
    get() = _BitcoinCard ?: UXIcon(name = "BitcoinCard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.01f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                curveToRelative(1.65f, 0f, 2.99f, -1.33f, 2.99f, -3f)
                curveToRelative(0f, -0.96f, -0.39f, -1.73f, -1.03f, -2.27f)
                curveToRelative(0.34f, -0.49f, 0.55f, -1.08f, 0.55f, -1.73f)
                curveToRelative(0f, -1.48f, -1.08f, -2.71f, -2.5f, -2.95f)
                verticalLineToRelative(-1.05f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(2f)
                close()
                moveTo(19.01f, 3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(19.01f, 7f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(5.5f, 14f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(22f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-12f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-13f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(20f)
                close()
            }
        }.also { _BitcoinCard = it}
