package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CupTogo: ImageVector? = null

val Icons.Rr.CupTogo: ImageVector
    get() = _CupTogo ?: UXIcon(name = "CupTogo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 5f)
                horizontalLineToRelative(-0.28f)
                lineToRelative(-0.38f, -1.82f)
                curveToRelative(-0.39f, -1.84f, -2.03f, -3.18f, -3.92f, -3.18f)
                lineTo(6.58f, -0f)
                curveToRelative(-1.88f, 0f, -3.53f, 1.34f, -3.92f, 3.18f)
                lineToRelative(-0.38f, 1.82f)
                horizontalLineToRelative(-0.28f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.2f)
                lineToRelative(1.46f, 12.58f)
                curveToRelative(0.29f, 2.52f, 2.43f, 4.42f, 4.97f, 4.42f)
                horizontalLineToRelative(6.73f)
                curveToRelative(2.54f, 0f, 4.67f, -1.9f, 4.97f, -4.42f)
                lineToRelative(1.46f, -12.58f)
                horizontalLineToRelative(0.21f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(4.8f, 12f)
                horizontalLineToRelative(14.4f)
                lineToRelative(-0.58f, 5f)
                lineTo(5.38f, 17f)
                lineToRelative(-0.58f, -5f)
                close()
                moveTo(6.58f, 2f)
                horizontalLineToRelative(10.84f)
                curveToRelative(0.94f, 0f, 1.76f, 0.67f, 1.96f, 1.59f)
                lineToRelative(0.29f, 1.41f)
                lineTo(4.33f, 5f)
                lineToRelative(0.29f, -1.41f)
                curveToRelative(0.19f, -0.92f, 1.02f, -1.59f, 1.96f, -1.59f)
                close()
                moveTo(19.78f, 7f)
                lineToRelative(-0.35f, 3f)
                lineTo(4.57f, 10f)
                lineToRelative(-0.35f, -3f)
                horizontalLineToRelative(15.56f)
                close()
                moveTo(15.36f, 22f)
                horizontalLineToRelative(-6.73f)
                curveToRelative(-1.52f, 0f, -2.8f, -1.14f, -2.98f, -2.65f)
                lineToRelative(-0.04f, -0.35f)
                horizontalLineToRelative(12.77f)
                lineToRelative(-0.04f, 0.35f)
                curveToRelative(-0.18f, 1.51f, -1.46f, 2.65f, -2.98f, 2.65f)
                close()
            }
        }.also { _CupTogo = it}
