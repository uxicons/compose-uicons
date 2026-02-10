package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlockQuote: ImageVector? = null

val Icons.Tc.BlockQuote: ImageVector
    get() = _BlockQuote ?: UXIcon(name = "BlockQuote") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.01f, 5.67f)
                curveToRelative(-0.07f, -0.27f, 0.1f, -0.54f, 0.36f, -0.61f)
                curveToRelative(0.17f, -0.04f, 4.33f, -1.06f, 10.62f, -1.06f)
                reflectiveCurveToRelative(10.45f, 1.02f, 10.62f, 1.06f)
                curveToRelative(0.27f, 0.07f, 0.43f, 0.34f, 0.36f, 0.61f)
                curveToRelative(-0.07f, 0.27f, -0.34f, 0.43f, -0.61f, 0.36f)
                curveToRelative(-0.04f, -0.01f, -4.22f, -1.03f, -10.38f, -1.03f)
                reflectiveCurveToRelative(-10.34f, 1.02f, -10.38f, 1.03f)
                curveToRelative(-0.27f, 0.06f, -0.54f, -0.1f, -0.61f, -0.36f)
                close()
                moveTo(22.62f, 20.06f)
                curveToRelative(-0.17f, -0.04f, -4.33f, -1.06f, -10.62f, -1.06f)
                curveToRelative(-2.22f, 0f, -4.42f, 0.13f, -6.56f, 0.38f)
                curveToRelative(-0.27f, 0.03f, -0.47f, 0.28f, -0.44f, 0.56f)
                curveToRelative(0.03f, 0.28f, 0.29f, 0.47f, 0.56f, 0.44f)
                curveToRelative(2.1f, -0.25f, 4.26f, -0.38f, 6.44f, -0.38f)
                curveToRelative(6.16f, 0f, 10.34f, 1.02f, 10.38f, 1.03f)
                curveToRelative(0.26f, 0.07f, 0.54f, -0.09f, 0.61f, -0.36f)
                curveToRelative(0.07f, -0.27f, -0.1f, -0.54f, -0.36f, -0.61f)
                close()
                moveTo(1.5f, 12f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(8.05f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-8.05f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(22.62f, 12.56f)
                curveToRelative(-0.17f, -0.04f, -4.33f, -1.06f, -10.62f, -1.06f)
                curveToRelative(-2.23f, 0f, -4.43f, 0.13f, -6.56f, 0.38f)
                curveToRelative(-0.27f, 0.03f, -0.47f, 0.28f, -0.44f, 0.56f)
                curveToRelative(0.03f, 0.28f, 0.29f, 0.47f, 0.56f, 0.44f)
                curveToRelative(2.09f, -0.25f, 4.25f, -0.38f, 6.44f, -0.38f)
                curveToRelative(6.16f, 0f, 10.34f, 1.02f, 10.38f, 1.03f)
                curveToRelative(0.26f, 0.07f, 0.54f, -0.09f, 0.61f, -0.36f)
                curveToRelative(0.07f, -0.27f, -0.1f, -0.54f, -0.36f, -0.61f)
                close()
            }
        }.also { _BlockQuote = it}
