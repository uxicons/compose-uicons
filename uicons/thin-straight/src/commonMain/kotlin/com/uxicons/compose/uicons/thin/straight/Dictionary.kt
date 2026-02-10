package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dictionary: ImageVector? = null

val Icons.Ts.Dictionary: ImageVector
    get() = _Dictionary ?: UXIcon(name = "Dictionary") {
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
                moveTo(4.5f, 1f)
                lineTo(20.5f, 1f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                lineTo(21f, 19f)
                lineTo(4.5f, 19f)
                curveToRelative(-0.56f, 0f, -1.08f, 0.2f, -1.5f, 0.51f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(4.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21f, 20f)
                verticalLineToRelative(3f)
                lineTo(4.5f, 23f)
                close()
                moveTo(6.48f, 11f)
                horizontalLineToRelative(2.62f)
                lineToRelative(0.47f, 2f)
                horizontalLineToRelative(1.03f)
                lineToRelative(-1.38f, -5.85f)
                curveToRelative(-0.16f, -0.67f, -0.75f, -1.15f, -1.44f, -1.15f)
                curveToRelative(-0.69f, -0.02f, -1.32f, 0.51f, -1.46f, 1.2f)
                lineToRelative(-1.33f, 5.8f)
                horizontalLineToRelative(1.03f)
                lineToRelative(0.46f, -2f)
                close()
                moveTo(7.3f, 7.42f)
                curveToRelative(0.09f, -0.55f, 0.83f, -0.55f, 0.95f, -0.05f)
                lineToRelative(0.62f, 2.62f)
                horizontalLineToRelative(-2.16f)
                lineToRelative(0.59f, -2.58f)
                close()
                moveTo(19f, 13f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-1.16f)
                lineToRelative(3.39f, -4.84f)
                horizontalLineToRelative(-3.39f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(1.16f)
                lineToRelative(-3.39f, 4.84f)
                horizontalLineToRelative(3.39f)
                verticalLineToRelative(1f)
                close()
                moveTo(13.5f, 10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _Dictionary = it}
