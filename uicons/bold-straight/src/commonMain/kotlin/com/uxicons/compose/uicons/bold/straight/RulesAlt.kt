package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RulesAlt: ImageVector? = null

val Icons.Bs.RulesAlt: ImageVector
    get() = _RulesAlt ?: UXIcon(name = "RulesAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(5f, 0f)
                curveTo(2.79f, 0f, 1f, 1.79f, 1f, 4f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(18f)
                lineTo(23f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(20f, 16f)
                horizontalLineToRelative(-10f)
                lineTo(10f, 3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(13f)
                close()
                moveTo(5f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.35f, 0f, -0.68f, 0.06f, -1f, 0.14f)
                lineTo(4f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(5f, 21f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(2f)
                lineTo(5f, 21f)
                close()
                moveTo(14.14f, 8.26f)
                lineToRelative(-2.04f, -2.15f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(1.5f, 1.58f)
                lineToRelative(2.54f, -2.63f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-3.11f, 3.22f)
                curveToRelative(-0.46f, 0.47f, -1.22f, 0.47f, -1.67f, -0.01f)
                close()
                moveTo(13.59f, 12f)
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
