package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CruzeiroSign: ImageVector? = null

val Icons.Rr.CruzeiroSign: ImageVector
    get() = _CruzeiroSign ?: UXIcon(name = "CruzeiroSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.91f, 18.59f)
                curveToRelative(-1.73f, 3.34f, -5.13f, 5.41f, -8.89f, 5.41f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.26f, 0f, -1.34f, -0.04f, -1.47f, -0.11f)
                curveToRelative(-4.82f, -0.71f, -8.53f, -4.88f, -8.53f, -9.89f)
                verticalLineToRelative(-4f)
                curveTo(2.02f, 4.49f, 6.51f, 0f, 12.02f, 0f)
                horizontalLineToRelative(1f)
                curveToRelative(3.82f, 0f, 7.26f, 2.13f, 8.96f, 5.55f)
                curveToRelative(0.25f, 0.5f, 0.04f, 1.09f, -0.45f, 1.34f)
                curveToRelative(-0.49f, 0.25f, -1.1f, 0.04f, -1.34f, -0.45f)
                curveToRelative(-1.36f, -2.74f, -4.11f, -4.45f, -7.17f, -4.45f)
                horizontalLineToRelative(-1f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 3.71f, 2.54f, 6.84f, 5.98f, 7.74f)
                verticalLineTo(12f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(0.53f)
                curveToRelative(1.06f, -0.95f, 2.46f, -1.53f, 4f, -1.53f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(5f)
                reflectiveCurveToRelative(0.01f, 0f, 0.02f, 0f)
                horizontalLineToRelative(1f)
                curveToRelative(3.01f, 0f, 5.73f, -1.66f, 7.11f, -4.33f)
                curveToRelative(0.25f, -0.49f, 0.86f, -0.68f, 1.35f, -0.43f)
                curveToRelative(0.49f, 0.25f, 0.68f, 0.86f, 0.43f, 1.35f)
                close()
            }
        }.also { _CruzeiroSign = it}
