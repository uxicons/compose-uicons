package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CruzeiroSign: ImageVector? = null

val Icons.Ts.CruzeiroSign: ImageVector
    get() = _CruzeiroSign ?: UXIcon(name = "CruzeiroSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.87f, 18.18f)
                lineToRelative(0.89f, 0.46f)
                curveToRelative(-1.71f, 3.31f, -5.09f, 5.37f, -8.81f, 5.37f)
                horizontalLineToRelative(-1.05f)
                curveToRelative(-5.46f, 0f, -9.91f, -4.45f, -9.91f, -9.91f)
                verticalLineToRelative(-4.18f)
                curveTo(2f, 4.45f, 6.45f, 0f, 11.91f, 0f)
                horizontalLineToRelative(1.05f)
                curveToRelative(3.79f, 0f, 7.19f, 2.11f, 8.88f, 5.5f)
                lineToRelative(-0.9f, 0.45f)
                curveToRelative(-1.52f, -3.05f, -4.58f, -4.95f, -7.98f, -4.95f)
                horizontalLineToRelative(-1.05f)
                curveTo(7f, 1f, 3f, 5f, 3f, 9.91f)
                verticalLineToRelative(4.18f)
                curveToRelative(0f, 4.26f, 3f, 7.83f, 7f, 8.7f)
                verticalLineTo(11f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2.34f)
                curveToRelative(1f, -1.42f, 2.64f, -2.34f, 4.5f, -2.34f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(6.45f)
                curveToRelative(0.3f, 0.03f, 0.6f, 0.05f, 0.91f, 0.05f)
                horizontalLineToRelative(1.05f)
                curveToRelative(3.35f, 0f, 6.38f, -1.85f, 7.92f, -4.82f)
                close()
            }
        }.also { _CruzeiroSign = it}
