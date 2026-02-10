package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TvRetro: ImageVector? = null

val Icons.Ts.TvRetro: ImageVector
    get() = _TvRetro ?: UXIcon(name = "TvRetro") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 6f)
                horizontalLineToRelative(-8.29f)
                lineTo(18.36f, 0.84f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-5.66f, 5.66f)
                lineTo(6.34f, 0.14f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(5.16f, 5.16f)
                lineTo(2.5f, 6f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                verticalLineToRelative(-14.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                close()
                moveTo(4f, 20f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-10f)
                lineTo(4f, 10f)
                verticalLineToRelative(10f)
                close()
                moveTo(5f, 11f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(8f)
                lineTo(5f, 19f)
                verticalLineToRelative(-8f)
                close()
                moveTo(21f, 11f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(21f, 15f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(21f, 19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _TvRetro = it}
