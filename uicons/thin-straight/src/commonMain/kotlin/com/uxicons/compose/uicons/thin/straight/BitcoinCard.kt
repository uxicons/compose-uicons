package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BitcoinCard: ImageVector? = null

val Icons.Ts.BitcoinCard: ImageVector
    get() = _BitcoinCard ?: UXIcon(name = "BitcoinCard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 10f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(0.75f)
                curveToRelative(1.24f, 0f, 2.25f, -1.01f, 2.25f, -2.25f)
                curveToRelative(0f, -0.83f, -0.45f, -1.56f, -1.12f, -1.95f)
                curveToRelative(0.39f, -0.4f, 0.62f, -0.95f, 0.62f, -1.55f)
                curveToRelative(0f, -1.24f, -1.01f, -2.25f, -2.25f, -2.25f)
                horizontalLineToRelative(-0.25f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                close()
                moveTo(19f, 2f)
                horizontalLineToRelative(2.25f)
                curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
                reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineToRelative(-2.25f)
                close()
                moveTo(19f, 5.5f)
                horizontalLineToRelative(2.75f)
                curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
                reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineToRelative(-2.75f)
                close()
                moveTo(3f, 16f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(6f, 16f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(23f, 11f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-13.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-15f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(22f)
                close()
            }
        }.also { _BitcoinCard = it}
