package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CruzeiroSign: ImageVector? = null

val Icons.Ss.CruzeiroSign: ImageVector
    get() = _CruzeiroSign ?: UXIcon(name = "CruzeiroSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.13f, 17.67f)
                lineToRelative(1.78f, 0.92f)
                curveToRelative(-1.73f, 3.34f, -5.13f, 5.41f, -8.89f, 5.41f)
                horizontalLineToRelative(-1f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                verticalLineToRelative(-4f)
                curveTo(2.02f, 4.49f, 6.51f, 0f, 12.02f, 0f)
                horizontalLineToRelative(1f)
                curveToRelative(3.82f, 0f, 7.26f, 2.13f, 8.96f, 5.55f)
                lineToRelative(-1.79f, 0.89f)
                curveToRelative(-1.36f, -2.74f, -4.11f, -4.45f, -7.17f, -4.45f)
                horizontalLineToRelative(-1f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 3.71f, 2.55f, 6.83f, 5.98f, 7.73f)
                verticalLineTo(11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.54f)
                curveToRelative(1.06f, -0.95f, 2.46f, -1.54f, 4f, -1.54f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(5f)
                reflectiveCurveToRelative(0.01f, 0f, 0.02f, 0f)
                horizontalLineToRelative(1f)
                curveToRelative(3.01f, 0f, 5.73f, -1.66f, 7.11f, -4.33f)
                close()
            }
        }.also { _CruzeiroSign = it}
