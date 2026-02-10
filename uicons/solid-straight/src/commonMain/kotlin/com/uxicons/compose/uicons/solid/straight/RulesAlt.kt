package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RulesAlt: ImageVector? = null

val Icons.Ss.RulesAlt: ImageVector
    get() = _RulesAlt ?: UXIcon(name = "RulesAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 20f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(4f)
                lineTo(4f, 24f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(6f, 18f)
                lineTo(6f, 0f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(15.77f)
                curveToRelative(0.55f, -0.49f, 1.26f, -0.77f, 2f, -0.77f)
                horizontalLineToRelative(2f)
                close()
                moveTo(22f, 2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-14f)
                lineTo(8f, 0f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(16.41f, 12f)
                lineToRelative(1.79f, -1.79f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.79f, -1.79f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.79f, -1.79f)
                close()
                moveTo(18.93f, 3.93f)
                lineToRelative(-1.4f, -1.43f)
                lineToRelative(-2.54f, 2.63f)
                lineToRelative(-1.5f, -1.58f)
                lineToRelative(-1.39f, 1.44f)
                lineToRelative(2.04f, 2.15f)
                curveToRelative(0.46f, 0.48f, 1.22f, 0.48f, 1.67f, 0.01f)
                lineToRelative(3.11f, -3.22f)
                close()
            }
        }.also { _RulesAlt = it}
