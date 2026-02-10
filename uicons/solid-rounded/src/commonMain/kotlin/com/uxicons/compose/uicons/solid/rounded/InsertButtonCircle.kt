package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertButtonCircle: ImageVector? = null

val Icons.Sr.InsertButtonCircle: ImageVector
    get() = _InsertButtonCircle ?: UXIcon(name = "InsertButtonCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.7f, 13f)
                horizontalLineToRelative(6.56f)
                lineToRelative(-3.25f, 4.03f)
                lineToRelative(-3.31f, -4.03f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(7f, 8f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(8f, 7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(17.1f, 12.07f)
                curveToRelative(-0.33f, -0.66f, -1.0f, -1.07f, -1.75f, -1.07f)
                horizontalLineToRelative(-6.72f)
                curveToRelative(-0.74f, 0f, -1.41f, 0.41f, -1.75f, 1.07f)
                curveToRelative(-0.33f, 0.66f, -0.27f, 1.45f, 0.2f, 2.08f)
                lineToRelative(3.33f, 4.11f)
                curveToRelative(0.37f, 0.5f, 0.94f, 0.79f, 1.57f, 0.79f)
                horizontalLineToRelative(0f)
                curveToRelative(0.62f, 0f, 1.2f, -0.29f, 1.54f, -0.76f)
                lineToRelative(3.39f, -4.17f)
                curveToRelative(0.44f, -0.6f, 0.51f, -1.38f, 0.18f, -2.04f)
                close()
            }
        }.also { _InsertButtonCircle = it}
