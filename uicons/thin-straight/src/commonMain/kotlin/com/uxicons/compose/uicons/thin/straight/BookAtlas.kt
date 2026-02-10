package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookAtlas: ImageVector? = null

val Icons.Ts.BookAtlas: ImageVector
    get() = _BookAtlas ?: UXIcon(name = "BookAtlas") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(2f, 21.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                lineTo(22f, 24f)
                lineTo(22f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(21f, 23f)
                lineTo(4.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21f, 20f)
                verticalLineToRelative(3f)
                close()
                moveTo(21f, 19f)
                lineTo(4.5f, 19f)
                curveToRelative(-0.56f, 0f, -1.08f, 0.19f, -1.5f, 0.5f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(20.5f, 1f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                lineTo(21f, 19f)
                close()
                moveTo(12f, 4f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(12f, 5f)
                curveToRelative(0.89f, 0f, 1.88f, 1.89f, 1.99f, 4.5f)
                horizontalLineToRelative(-3.98f)
                curveToRelative(0.11f, -2.61f, 1.1f, -4.5f, 1.99f, -4.5f)
                close()
                moveTo(10.03f, 5.41f)
                curveToRelative(-0.58f, 0.99f, -0.96f, 2.42f, -1.02f, 4.09f)
                horizontalLineToRelative(-1.98f)
                curveToRelative(0.18f, -1.84f, 1.37f, -3.39f, 3.0f, -4.09f)
                close()
                moveTo(7.03f, 10.5f)
                horizontalLineToRelative(1.98f)
                curveToRelative(0.06f, 1.67f, 0.44f, 3.11f, 1.02f, 4.09f)
                curveToRelative(-1.63f, -0.7f, -2.82f, -2.25f, -3.0f, -4.09f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-0.89f, 0f, -1.88f, -1.89f, -1.99f, -4.5f)
                horizontalLineToRelative(3.98f)
                curveToRelative(-0.11f, 2.61f, -1.1f, 4.5f, -1.99f, 4.5f)
                close()
                moveTo(13.97f, 14.59f)
                curveToRelative(0.58f, -0.99f, 0.96f, -2.42f, 1.02f, -4.09f)
                horizontalLineToRelative(1.98f)
                curveToRelative(-0.18f, 1.84f, -1.37f, 3.39f, -3.0f, 4.09f)
                close()
                moveTo(14.99f, 9.5f)
                curveToRelative(-0.06f, -1.67f, -0.44f, -3.11f, -1.02f, -4.09f)
                curveToRelative(1.63f, 0.7f, 2.82f, 2.25f, 3.0f, 4.09f)
                horizontalLineToRelative(-1.98f)
                close()
            }
        }.also { _BookAtlas = it}
