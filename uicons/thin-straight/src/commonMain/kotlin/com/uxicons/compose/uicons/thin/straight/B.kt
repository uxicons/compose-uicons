package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _B: ImageVector? = null

val Icons.Ts.B: ImageVector
    get() = _B ?: UXIcon(name = "B") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 24f)
                lineTo(4.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(2f, 2.5f)
                curveTo(2f, 1.12f, 3.12f, 0f, 4.5f, 0f)
                lineTo(13f, 0f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 2.11f, -1.1f, 3.97f, -2.75f, 5.04f)
                curveToRelative(3.23f, 0.37f, 5.75f, 3.13f, 5.75f, 6.46f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                close()
                moveTo(3f, 12f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                lineTo(15.5f, 23f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.47f, -5.5f, -5.5f, -5.5f)
                lineTo(3f, 12f)
                close()
                moveTo(3f, 11f)
                lineTo(13f, 11f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(15.76f, 1f, 13f, 1f)
                lineTo(4.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(3f, 11f)
                close()
            }
        }.also { _B = it}
