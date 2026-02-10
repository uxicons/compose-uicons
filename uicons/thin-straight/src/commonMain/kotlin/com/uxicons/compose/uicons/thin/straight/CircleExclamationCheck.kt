package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleExclamationCheck: ImageVector? = null

val Icons.Ts.CircleExclamationCheck: ImageVector
    get() = _CircleExclamationCheck ?: UXIcon(name = "CircleExclamationCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 14f)
                horizontalLineToRelative(-1f)
                lineTo(9.5f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(8f)
                close()
                moveTo(9f, 17f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveTo(16.11f, 12.57f)
                lineToRelative(-2.47f, -2.43f)
                lineToRelative(-0.7f, 0.71f)
                lineToRelative(2.48f, 2.43f)
                curveToRelative(0.48f, 0.47f, 1.11f, 0.71f, 1.75f, 0.71f)
                curveToRelative(0.64f, 0f, 1.27f, -0.24f, 1.76f, -0.72f)
                lineToRelative(4.97f, -4.92f)
                lineToRelative(-0.7f, -0.71f)
                lineToRelative(-4.97f, 4.91f)
                curveToRelative(-0.58f, 0.57f, -1.52f, 0.57f, -2.1f, 0.01f)
                close()
                moveTo(10f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(5.04f, 3f, 10f, 3f)
                curveToRelative(4.04f, 0f, 7.47f, 2.68f, 8.6f, 6.36f)
                lineToRelative(0.78f, -0.78f)
                curveToRelative(-1.4f, -3.84f, -5.07f, -6.59f, -9.39f, -6.59f)
                curveTo(4.49f, 2f, 0f, 6.49f, 0f, 12f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(4.33f, 0f, 8.01f, -2.77f, 9.4f, -6.62f)
                curveToRelative(-0.4f, 0.23f, -0.84f, 0.41f, -1.29f, 0.51f)
                curveToRelative(-1.45f, 3.02f, -4.54f, 5.12f, -8.11f, 5.12f)
                close()
            }
        }.also { _CircleExclamationCheck = it}
