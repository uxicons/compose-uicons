package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SdCard: ImageVector? = null

val Icons.Sc.SdCard: ImageVector
    get() = _SdCard ?: UXIcon(name = "SdCard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.88f, 2.67f)
                curveToRelative(-0.1f, -0.28f, -0.32f, -0.5f, -0.59f, -0.6f)
                curveToRelative(-0.12f, -0.04f, -2.89f, -1.06f, -7.29f, -1.06f)
                curveToRelative(-1.11f, 0f, -2.23f, 0.07f, -3.32f, 0.2f)
                curveToRelative(-0.22f, 0.03f, -0.43f, 0.13f, -0.58f, 0.28f)
                lineToRelative(-4.49f, 4.49f)
                curveToRelative(-0.16f, 0.16f, -0.26f, 0.36f, -0.28f, 0.58f)
                curveToRelative(-0.22f, 1.68f, -0.33f, 3.51f, -0.33f, 5.44f)
                curveToRelative(0f, 6.1f, 1.08f, 9.21f, 1.12f, 9.34f)
                curveToRelative(0.1f, 0.28f, 0.32f, 0.5f, 0.59f, 0.6f)
                curveToRelative(0.12f, 0.04f, 2.89f, 1.06f, 7.29f, 1.06f)
                reflectiveCurveToRelative(7.17f, -1.02f, 7.29f, -1.06f)
                curveToRelative(0.28f, -0.1f, 0.49f, -0.32f, 0.59f, -0.6f)
                curveToRelative(0.05f, -0.13f, 1.12f, -3.23f, 1.12f, -9.34f)
                reflectiveCurveToRelative(-1.08f, -9.21f, -1.12f, -9.34f)
                close()
                moveTo(11f, 7f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(14f, 7f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(17f, 7f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _SdCard = it}
