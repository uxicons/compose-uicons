package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RulesAlt: ImageVector? = null

val Icons.Rs.RulesAlt: ImageVector
    get() = _RulesAlt ?: UXIcon(name = "RulesAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(17f)
                lineTo(22f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(20f, 18f)
                horizontalLineToRelative(-12f)
                lineTo(8f, 2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(16f)
                close()
                moveTo(5f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.35f, 0f, -0.69f, 0.07f, -1f, 0.18f)
                lineTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(5f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(2f)
                lineTo(5f, 22f)
                close()
                moveTo(13.14f, 8.26f)
                lineToRelative(-2.04f, -2.15f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(1.5f, 1.58f)
                lineToRelative(2.54f, -2.63f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-3.11f, 3.22f)
                curveToRelative(-0.46f, 0.47f, -1.22f, 0.47f, -1.67f, -0.01f)
                close()
                moveTo(12.59f, 13f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(1.79f, -1.79f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.79f, -1.79f)
                close()
            }
        }.also { _RulesAlt = it}
